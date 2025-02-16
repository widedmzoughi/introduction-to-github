public class Cercle implements Graphic {
    private int rayon;
    private int couleur;

    public Cercle(int rayon) {
        this.rayon = rayon;
        this.couleur = -1; // Couleur par défaut, non coloré
    }


    public void drow() {
        System.out.println("Traçage graphique du cercle de rayon " + rayon);
    }


    public void colorer(int color) {
        System.out.println("Changement avec succès de la couleur du cercle du " + rayon + " vers la couleur " + color);
        this.couleur = color;
    }

    public int getRayon() {
        return rayon;
    }

    public int getCouleur() {
        return couleur;
    }
}
