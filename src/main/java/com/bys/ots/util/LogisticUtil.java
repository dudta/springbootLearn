/**
 * 物流信息查询
 */
package com.bys.ots.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bys.ots.controller.OrderController;
import net.sf.json.xml.XMLSerializer;
import nu.xom.ParsingException;
/**
 * 
 * @author wanggang
 *  2019/11/27
 */
public class LogisticUtil
{
    static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    public static Map searchLogistic(String orderId,String parternID) throws ParsingException, JSONException
    {
//         String parternID = LogisticConstant.BLUEBOX_PARTNERED;
        // TODO Auto-generated method stub
        // 获取连接客户端工具
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String entityStr = null;
        CloseableHttpResponse response = null;

        String digest = orderId + parternID;
        MD5Util m = new MD5Util();
        String base64 = null;
        try
        {
            base64 = m.md5EncryptBase64(digest);
        }
        catch (Exception e1)
        {
            logger.error(">-Logistic digest MD5Util encrypt algorithm error!物流系统加密错误！");
            e1.printStackTrace();
        }

        try
        {
            URIBuilder uriBuilder = new URIBuilder("http://tf-we-api-test.vipservice.tech/HttpPost_TF_Waybill.aspx");
            uriBuilder.addParameter("orderid", orderId);
            uriBuilder.addParameter("digest", base64);
            HttpPost httpGet = new HttpPost(uriBuilder.build());
            httpGet.addHeader("User-Agent",
                              "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.6)");
            httpGet.addHeader("Content-Type", "application/x-www-form-urlencoded");
            // 执行请求
            response = httpClient.execute(httpGet);
            // 获得响应的实体对象
            HttpEntity entity = response.getEntity();
            // 使用Apache提供的工具类进行转换成字符串
            entityStr = EntityUtils.toString(entity, "UTF-8");
        }
        catch (ClientProtocolException e)
        {
            logger.error("Http协议出现问题");
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            logger.error("解析错误");
            e.printStackTrace();
        }
        catch (URISyntaxException e)
        {
            logger.error("URI解析异常");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            logger.error("IO异常");
            e.printStackTrace();
        }
        finally
        {
            // 释放连接
            if (null != response)
            {
                try
                {
                    response.close();
                    httpClient.close();
                }
                catch (IOException e)
                {
                    logger.error("释放连接出错");
                    e.printStackTrace();
                }
            }
        }
        // 打印响应内容
        XMLSerializer xMLSerializer = new XMLSerializer();
        net.sf.json.JSONObject json = net.sf.json.JSONObject
                .fromObject(xMLSerializer.read(entityStr));
        Map<String, Object> map = new HashMap<String, Object>();
//        XMLSerializer xMLSerializer = new XMLSerializer();
//        json = xMLSerializer.read(entityStr);
        Object response0 = json.get("response");
        logger.info("=>物流查询结果： result：orderId：{},responce0：{}",orderId,response0);
        //如果查不到此物流信息
        if (response0 == null)
        {
            map.put("data", null);
            return map;
        }
        net.sf.json.JSONObject response1 = net.sf.json.JSONObject.fromObject(response0);
        Object data = response1.get("shipment");
        map.put("data", data);
        return map;
    }
}
