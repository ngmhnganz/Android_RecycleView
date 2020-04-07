package com.nguyenminhngan.com.model;

public class Contact {
    private int avatar;
    private String ten;
    private String phone;

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(int avatar, String ten, String phone) {
        this.avatar = avatar;
        this.ten = ten;
        this.phone = phone;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "avatar=" + avatar +
                ", ten='" + ten + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
