package question2;

import java.lang.annotation.Annotation;

public class Menu {
    @Food(price=12.5)
    public class Kebab{
        @Time(takes = 12)
        public void Prepare(){}
        @Time(takes = 20)
        public void Cook(){}
        @Time(takes = 10)
        public void Send(){}
    }

    @Food(price=30)
    public class Sushi{
        @Time(takes = 30)
        public void Prepare(){}

        @Time(takes = 20)
        public void Send(){}
    }
    @Food(price = 22.5)
    public static class Pizza {
        @Time(takes = 10)
        public void Prepare(){}
        @Time(takes = 20)
        public void Cook(){}
        @Time(takes = 15)
        public void Send(){}
    }

    public class methods{
        @Time(takes = 0)
        public void Prepare(){}
        @Time(takes = 0)
        public void Cook(){}
        @Time(takes = 0)
        public void Send(){}


    }
}
