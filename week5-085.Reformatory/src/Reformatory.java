public class Reformatory {

    private int weightsMeasured = 0;

    public int weight(Person person) {
        weightsMeasured++;
        int weight = person.getWeight();
        return weight;
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return weightsMeasured;
    }

}
