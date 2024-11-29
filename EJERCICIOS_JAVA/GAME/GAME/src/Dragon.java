public class Dragon extends Personaje {
    // Atributos únicos
    int poderDeAtaque;
    String ataqueEspecial;
    int poderAtaqueEspecial;

    // Constructor
    public Dragon(String nombre, int vida_hp, int poderDeAtaque, String ataqueEspecial, int poderAtaqueEspecial) {
        super(nombre, vida_hp);
        this.poderDeAtaque = poderDeAtaque;
        this.ataqueEspecial = ataqueEspecial;
        this.poderAtaqueEspecial = poderAtaqueEspecial;
    }

    // Metodos
    public void atacar(Jinete oponente) {
        oponente.recibirDaño(this.poderDeAtaque);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " y reduce su vida a " + oponente.getVida_hp());
    }

    public void volar(Jinete oponente) {
        System.out.println(this.nombre + " vuela y esquiva en el momento el ataque de " + oponente.getNombre());
    }

    public void ataqueEspecial(Jinete oponente) {
        oponente.recibirDaño(poderAtaqueEspecial);
        System.out.println(this.nombre + " usa su ataque especial: " + ataqueEspecial + " y causa " + poderAtaqueEspecial + " de daño a " + oponente.getNombre() + "!");
    }

    public void defenderse(Jinete oponente) {
        System.out.println(this.nombre + " se defiende.");
    }

    public boolean isVivo() {
        return this.vivo; 
    }
}
