
/**
 * Write a description of class ArticleReparation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArticleReparation extends Article
{
    private double duree;
    private String desc2;
    /**
     * Constructor for objects of class ArticleReparation
     */
    public ArticleReparation(double tempsdetaf)
    {
        
        this.duree = tempsdetaf;
    }
    public double nbrhtaff(){
    return duree;}

    public String getDescription() {
        desc2="Reparation(" +this.nbrhtaff()+ " heures)";
        return desc2;
    }
    
    /**
     * @pre  -
     * @post retourne le prix (HTVA) de cet article.
     */
    public double getPrix() {
        
        return this.nbrhtaff()*35+20;
    }
    
}
