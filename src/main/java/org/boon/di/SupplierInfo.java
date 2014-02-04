package org.boon.di;

import org.boon.core.Supplier;

/**
 * Created by Richard on 2/3/14.
 */
public class SupplierInfo<T> {

    private String name;
    private Class<T> type;
    private Supplier<T> supplier;
    private T object;


    public SupplierInfo( String name, Class<T> type, Supplier<T> supplier, T object ) {
        this.name = name;
        this.type = type;
        this.supplier = supplier;
        this.object = object;
    }

    public static <T> SupplierInfo<T> supplierOf( Class<T> type, Supplier<T> supplier ) {
        return new SupplierInfo<>( null, type, supplier, null );
    }


    public static <T> SupplierInfo<T> supplierOf( String name, Class<T> type, Supplier<T> supplier ) {
        return new SupplierInfo<>( name, type, supplier, null );
    }


    public static <T> SupplierInfo<T> supplierOf( String name, Supplier<T> supplier ) {
        return new SupplierInfo<>( name, null, supplier, null );
    }


    public static <T> SupplierInfo<T> supplierOf( String name, Class<T> type ) {
        return new SupplierInfo<>( name, type, null, null );
    }


    public static <T> SupplierInfo<T> supplierOf( Class<T> type ) {
        return new SupplierInfo<>( null, type, null, null );
    }


    public static <T> SupplierInfo<T> supplierOf( String name, T object ) {
        return new SupplierInfo<>( name, null, null, object );
    }


    public static <T> SupplierInfo<T> supplierOf( T object ) {
        return new SupplierInfo<>( null, null, null, object );
    }

    public Class<T> type() {
        return type;
    }

    public Supplier<T> supplier() {
        return supplier;
    }

    public String name() {
        return name;
    }

    public Object value() {
        return object;
    }

}
