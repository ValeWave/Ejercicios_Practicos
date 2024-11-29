public abstract class Personaje {

    protected String nombre;
    protected int vida_hp;
    protected boolean vivo; 

    // Constructor
    public Personaje(String nombre, int vida_hp) {
        this.nombre = nombre;
        this.vida_hp = vida_hp;
        this.vivo = vida_hp > 0; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida_hp() {
        return vida_hp;
    }

    //Metodos
    public boolean isVivo() {
        return vivo;
    }

    public void recibirDaño(int daño) {
        this.vida_hp -= daño;
        if (this.vida_hp <= 0) {
            this.vida_hp = 0;  
            this.vivo = false; // personaje desvivido
        }
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Vida: " + vida_hp);
    }
}
