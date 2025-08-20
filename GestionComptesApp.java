public class GestionComptesApp {
    public static void main(String[] args) {
        System.out.println("=== Application de Gestion des Comptes Bancaires ===\n");
        
        // Test du constructeur sans paramètres
        Compte compte1 = new Compte();
        compte1.setNum(123456L);
        compte1.setNomClient("Ahmed Alami");
        compte1.setSolde(5000.0);
        
        System.out.println("Compte 1 créé avec constructeur par défaut:");
        compte1.afficherCompteInfo();
        System.out.println();
        
        // Test du constructeur avec paramètres
        Compte compte2 = new Compte(789012L, "Fatima Benali", 3500.0);
        
        System.out.println("Compte 2 créé avec constructeur paramétré:");
        compte2.afficherCompteInfo();
        System.out.println();
        
        // Test des opérations sur le compte 1
        System.out.println("=== Opérations sur le compte 1 ===");
        compte1.deposer(1000.0);
        compte1.retirer(2000.0);
        compte1.retirer(10000.0); // Test solde insuffisant
        System.out.println();
        
        // Test des opérations sur le compte 2
        System.out.println("=== Opérations sur le compte 2 ===");
        compte2.deposer(500.0);
        compte2.retirer(1500.0);
        System.out.println();
        
        // Affichage final des comptes
        System.out.println("=== État final des comptes ===");
        System.out.println("Compte 1:");
        compte1.afficherCompteInfo();
        System.out.println();
        
        System.out.println("Compte 2:");
        compte2.afficherCompteInfo();
    }
}