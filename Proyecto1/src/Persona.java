public class Persona {
    protected String nombre;
    protected Integer id;

    public Persona(){
        nombre = "";
        id = 0;
    }

    public Persona(String nombre, Integer id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + "\n" + "Id: " + this.getId();
    }
}
