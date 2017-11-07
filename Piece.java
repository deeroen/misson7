
/**
 * Write a description of class Piece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Piece
{
    // instance variables - replace the example below with your own
    private String description;
    private double prixunit;
    private double poidsunitkg;
    private boolean fragile;
    private boolean TVAred;
    

    /**
     * Constructor for objects of class Piece
     */
    public Piece(String d, double pr, double po, boolean fr, boolean TVA)
    {
        this.description=d;
        this.prixunit=pr;
        this.poidsunitkg=po;
        this.fragile=fr;
        this.TVAred=TVA;
    }

    /**
     *constructeur a deux paramètres
     */
    public Piece(String d, double pr)
    {this.description=d;
     this.prixunit=pr;
    }
    public String getdescription(){
        return description;
    }
    public double getprixunit(){
        return prixunit;
    }
    public double getpoidsunit(){
        return poidsunitkg;
    }
    public boolean getfragile(){
    return fragile;}
    public boolean getTVAred(){
    return TVAred;}
    
    /**
     * methoque qui renvoit si deux objets sont identiques
     */
    public boolean equals(Object a){
    if(a!=null && (a instanceof Piece )){
        Piece p =(Piece) a;
     return (this.getdescription()==p.getdescription() && this.getprixunit()==p.getprixunit());   
    }
    return false;
}
}
