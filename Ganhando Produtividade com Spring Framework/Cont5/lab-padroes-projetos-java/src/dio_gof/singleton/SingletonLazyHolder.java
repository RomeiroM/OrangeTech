package dio_gof.singleton;

public class SingletonLazyHolder {
    
    private static class InstanciaHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanciaHolder.instancia;
    }
}
