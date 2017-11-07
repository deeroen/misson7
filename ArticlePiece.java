
/**
 * Write a description of class ArticlePiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArticlePiece extends Article
{
    private int nbr;
    private Piece c;
    /**
     * Constructor for objects of class ArticlePiece
     */
  
    
    public ArticlePiece(int a ,Piece p){
        nbr=a;
        c=p;
        }
    
    public Piece getPiece(){
    return this.c;}  
    
    public int getnombre(){
    return this.nbr;}
    
    /**
     * @pre  -
     * @post retourne la description de cet article.
     */
    public String getDescription() {
        return c.getdescription()+" @ "+c.getprixunit();
    }
    
    /**
     * @pre  -
     * @post retourne le prix (HTVA) de cet article.
     */
    public double getPrix() {
        return c.getprixunit()*nbr;
    }
    
    /**
     * @pre  -
     * @post retourne la TVA sur cet article.
     */
    public double getTVA() {
        if(c.getTVAred()){
            return getPrix()*0.06;
        }
        else {return getPrix() * 0.21;}
    }
}
