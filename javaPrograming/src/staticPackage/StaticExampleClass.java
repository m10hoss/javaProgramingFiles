package staticPackage;

public class StaticExampleClass {
        private static int WheelCount = 4;
        private String make;
        private static int instanceNum = 0;

        public StaticExampleClass(String make){
            this.make = make;
            instanceNum++;
        }
        public String getMake(){
            return make;
        }
        public static int getInstanceNum(){
            return instanceNum;
        }
    }

