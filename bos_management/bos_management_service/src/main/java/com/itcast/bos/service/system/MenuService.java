package com.itcast.bos.service.system;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.itcast.bos.domain.system.Menu;
import com.itcast.bos.domain.system.User;

/**  
 * ClassName:MenuService <br/>  
 * Function:  <br/>  
 * Date:     2018年3月28日 下午8:02:47 <br/>       
 */
public interface MenuService {

    List<Menu> findLevelOne();

    void save(Menu model);

    Page<Menu> findAll(Pageable pageable);

    List<Menu> findbyUser(User user);

}
  
