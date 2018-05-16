
public class BoundedCounter {

        private int value = 0;
        private int upperBound;

        public BoundedCounter(int upperBound){
            this.upperBound = upperBound;
        }

        public int getValue(){
            return value;
        }

        public void next(){
            if(value<upperBound){
                value++;
            }
            else{
                value = 0;
            }
        }

        @Override
        public String toString(){
            String countString = String.format("%02d",value);
            return (countString);
        }

        public void setValue(int value){
            if(value>=0&&value<=upperBound){
                this.value = value;
            }
        }
    }

