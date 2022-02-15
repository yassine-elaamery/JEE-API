package LEILAYASSINEMSI2.cigma;
import LEILAYASSINEMSI2.cigma.controllers.UserRestController;
import LEILAYASSINEMSI2.cigma.Entities.user;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
@RunWith(SpringRunner.class)
public class userRestControllerTests {


    private UserRestController controller;

    private userService service;


    @Test
    public void getListUserTest() throws Exception{
        Page<user> pro= Mockito.mock(Page.class);
        when(service.selectAll(Pageable.ofSize(1))).thenReturn(pro);
        Page<user> UerFromService = service.selectAll(Pageable.ofSize(1));
        when(service.selectAll(Pageable.ofSize(1))).thenReturn(UerFromService);

    }
    @Test
    public void createNewUserTest() {

        user Test1 = new user();
        Test1.setEmail("y.elaamery@gmail.com");
        Test1.setFullName("YASSINE EL AAMERY");
        BDDMockito.given(service.insert(Test1)).willReturn(Test1);
        user createdUser = service.insert(Test1);
    }

}
