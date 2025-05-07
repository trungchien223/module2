package case_study.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();

    void add(T t);

    void edit(String id, T t);
    
}
