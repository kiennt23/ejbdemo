package net.kiennt.ejbdemo.ejb;

import net.kiennt.ejbdemo.model.Common;

import javax.ejb.Stateless;

/**
 * Created by kiennguyen on 10/4/16.
 */
@Stateless(name = "KienEJB")
public class KienBean implements Kien {
    public KienBean() {
    }

    @Override
    public String sayHey() {
        Common common = new Common();
        return "EJB says hey. Via EJB: " + common.sayHello();
    }
}
