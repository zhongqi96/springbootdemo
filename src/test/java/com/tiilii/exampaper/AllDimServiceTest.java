package com.tiilii.exampaper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tiilii.alldim.model.dim.dimBlood.DimBlood;
import com.tiilii.alldim.service.AllDimService;
import com.tiilii.framework.core.exception.SystemException;

/**
 * @ClassName: AllDimServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月21日 下午12:05:33
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AllDimServiceTest {
	@Autowired
	private AllDimService allDimService;

	@Test
	public void findDimBloodTest() throws SystemException{
		List<DimBlood> list = allDimService.findDimBlood();
		for (DimBlood dimBlood : list) {
			System.out.println(dimBlood.getBloodName());
		}
	}
}
