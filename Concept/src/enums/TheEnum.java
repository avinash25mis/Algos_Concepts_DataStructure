package enums;

import Inheritance.ClassImplentInterface.LeftInterface;

/**
 * @author avinash.a.mishra
 *
 * We can have enum implementing Interface but enum cannot exten Class
 * can can have setters in Interface without any exception
 *
 */
enum TheEnum implements LeftInterface {

     NUMBER_0(0),
     NUMBER_5(5),
     NUMBER_10(10);

     private Integer visibility;

    private TheEnum(final Integer visibility) {
        this.visibility = visibility;
    }


     public Integer getVisibility() {
         return visibility;
     }

     public void setVisibility(final Integer visibility) {
         this.visibility = visibility;
     }



    @Override
    public String abc() {
        return null;
    }
}
