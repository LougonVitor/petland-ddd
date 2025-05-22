package com.petland.domain.register;

public class Profile {
    private boolean customer;
    private boolean supplier;
    private boolean provider;

    public boolean isProvider() {
        return provider;
    }

    public void setProvider(boolean provider) {
        this.provider = provider;
    }

    public boolean isSupplier() {
        return supplier;
    }

    public void setSupplier(boolean supplier) {
        this.supplier = supplier;
    }

    public boolean isCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }
}