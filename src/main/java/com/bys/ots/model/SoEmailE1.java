package com.bys.ots.model;

public class SoEmailE1 extends SoEmailE1Key {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_email_e1.Partner
     *
     * @mbg.generated
     */
    private String partner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_email_e1.Customer
     *
     * @mbg.generated
     */
    private String customer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_email_e1.Email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_email_e1.Partner
     *
     * @return the value of so_email_e1.Partner
     *
     * @mbg.generated
     */
    public String getPartner() {
        return partner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_email_e1.Partner
     *
     * @param partner the value for so_email_e1.Partner
     *
     * @mbg.generated
     */
    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_email_e1.Customer
     *
     * @return the value of so_email_e1.Customer
     *
     * @mbg.generated
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_email_e1.Customer
     *
     * @param customer the value for so_email_e1.Customer
     *
     * @mbg.generated
     */
    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_email_e1.Email
     *
     * @return the value of so_email_e1.Email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_email_e1.Email
     *
     * @param email the value for so_email_e1.Email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}