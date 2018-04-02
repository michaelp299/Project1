public class Present {
    public double weight;
    public double cost;
    public Sweets [] sweet;

    public Present(double weight, double cost, Sweets[] sweet) {
        this.weight = weight;
        this.cost = cost;
        this.sweet = sweet;
    }

    public Present() {
        this.weight = 0;
        this.cost = 0;
        this.sweet = null;
    }

    public double getWeight() {
        for(int i=0; i<sweet.length; i++){
            weight += sweet[i].weight;
        }
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        for(int i=0; i<sweet.length; i++){
            cost += sweet[i].price;
        }
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Sweets[] getSweet() {
        return sweet;
    }

    public void setSweet(Sweets[] sweet) {
        this.sweet = sweet;
    }

    public void setPresent(int count){
        sweet = new Sweets[count];
        for(int i=0; i<count; i++){
            sweet[i] = new Sweets();
        }
    }

    public void printPresent(){
        System.out.println("\nВес подарка: " + this.getWeight());
        System.out.println("Цена подарка: " + this.getCost() + "\n");

        for(int i=0; i<sweet.length; i++){
            sweet[i].outputParameters();
        }
    }
}
