package bridgepattern;

import java.util.List;

class Product{
}

class User{
}

//Abstraction
interface Service<T>{
    List<T> getAll();

    T save(T o);

    int delete(T o);
}
class UserService implements Service<User>{

    private final Repository<User> userRepository = new UserRepository();

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public int delete(User o) {
        return 0;
    }
}
class ProductService implements Service<Product>{

    private final Repository<Product> productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product save(Product o) {
        return null;
    }

    @Override
    public int delete(Product o) {
        return 0;
    }
}

//Implement
interface Repository<T>{
    List<T> findAll();

    T save(T o);

    int delete(T o);
}
class UserRepository implements Repository<User>{

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public int delete(User o) {
        return 0;
    }
}
class ProductRepository implements Repository<Product>{

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product save(Product o) {
        return null;
    }

    @Override
    public int delete(Product o) {
        return 0;
    }
}

public class ClientCod {
    public static void main(String[] args) {

    }

}
