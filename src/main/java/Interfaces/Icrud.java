package Interfaces;

public interface Icrud<T> {
    /* CRUD - CREATE, READ, UPDATE, DELETE */
    /* HTTP METHODs - POST, GET, PUT, DELETE */
    public void post(T t);

    public Object get(int id);

    public T[] getAll();

    public void put(T t);

    public void delete(int id);
}
