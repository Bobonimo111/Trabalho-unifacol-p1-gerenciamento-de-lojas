package Interfaces;

public interface Icrud<T> {
    /* CRUD - CREATE, READ, UPDATE, DELETE */
    /* HTTP METHODs - POST, GET, PUT, DELETE */

    public void create(T t);

    public T[] getAll();

    public T get(int id);

    public boolean put(T t);

    public boolean delete(int code);
}
