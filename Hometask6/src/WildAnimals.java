public abstract class WildAnimals extends Animals {
        public abstract String getEnvironment();

        public boolean fearPeople(){
            return true;
        }
        public int count;
        public void setCount(int count){
            this.count = count;
        }

}
