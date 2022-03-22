package com.gorkemsavran;

import java.util.Objects;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int compareTo(final Brand brand) {
        return name.compareTo(brand.name);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Brand brand = (Brand) o;

        if (id != brand.id) return false;
        return Objects.equals(name, brand.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
