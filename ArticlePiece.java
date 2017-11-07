
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
}
