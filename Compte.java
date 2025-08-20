public class Compte {
    private long num;
    private String nomClient;
    private double solde;
    
    public Compte() {
    }
    
    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }
    
    public long getNum() {
        return num;
    }
    
    public void setNum(long num) {
        this.num = num;
    }
    
    public String getNomClient() {
        return nomClient;
    }
    
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    
    public double getSolde() {
        return solde;
    }
    
    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public void afficherCompteInfo() {
        System.out.println("Numéro de compte: " + num);
        System.out.println("Nom du client: " + nomClient);
        System.out.println("Solde: " + solde + " DH");
    }
    
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " DH effectué. Nouveau solde: " + solde + " DH");
        } else if (montant > solde) {
            System.out.println("Solde insuffisant. Solde actuel: " + solde + " DH");
        } else {
            System.out.println("Montant invalide.");
        }
    }
    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " DH effectué. Nouveau solde: " + solde + " DH");
        } else {
            System.out.println("Montant invalide.");
        }
    }
}