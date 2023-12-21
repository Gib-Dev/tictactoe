// Importation des classes du package AWT pour la création d'interfaces graphiques
import java.awt.*;
import java.awt.event.*;

// Définition de la classe Fdemo qui étend la classe Frame et implémente l'interface ActionListener
class Fdemo extends Frame implements ActionListener {

    // Création d'un tableau vide de boutons
    Button b[] = new Button[9];

    // Variables pour positionner les boutons dans la fenêtre
    int k = 0, x = 8, y = 28;

    // Constructeur de la classe Fdemo
    Fdemo() {
        // Configuration de la fenêtre
        setLayout(null); // Pas de gestionnaire de disposition
        setVisible(true); // Rendre la fenêtre visible
        setSize(800, 600); // Dimension de la fenêtre (largeur x hauteur)
        setLocation(400, 100); // Position de la fenêtre sur l'écran (x, y)
        setBackground(Color.black); // Couleur de fond de la fenêtre (noir)
        setForeground(Color.white); // Couleur du texte de la fenêtre (blanc)

        // Boucle pour créer une grille de boutons 3x3 dans la fenêtre
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                // Création d'un nouveau bouton
                b[k] = new Button();
                b[k].setSize(100, 100); // Définition de la taille du bouton
                b[k].setLocation(x, y); // Définition de la position du bouton
                b[k].setFont(new Font("", Font.BOLD, 40)); // Définition de la police du texte du bouton

                add(b[k]); // Ajout du bouton à la fenêtre

                b[k].addActionListener(this); // Ajout d'un écouteur d'événements au bouton
                b[k].setBackground(new Color(255, 141, 28)); // Définition de la couleur de fond du bouton
                k++; // Incrémentation de l'indice du tableau
                x = x + 100; // Déplacement horizontal pour le prochain bouton
            }
            x = 8; // Réinitialisation de la position horizontale
            y = y + 100; // Déplacement vertical pour la prochaine ligne de boutons
        }
    }

    // Méthode de l'interface ActionListener (à implémenter, mais ici elle est vide pour le moment)
    public void actionPerformed(ActionEvent e) {
        // Cette méthode pourrait contenir du code pour réagir à des événements d'action, mais elle est actuellement vide
    }
}

// Classe principale du programme
public class tictactoe {
    // Méthode principale du programme
    public static void main(String args[]) {
        // Création d'une instance de la classe Fdemo (la fenêtre)
        Fdemo f = new Fdemo();
    }
}
