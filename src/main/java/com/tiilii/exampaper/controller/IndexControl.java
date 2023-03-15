package com.tiilii.exampaper.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiilii.alldim.model.dim.dimBlood.DimBlood;
import com.tiilii.alldim.service.AllDimService;
import com.tiilii.framework.core.exception.SystemException;

/**
 * @ClassName: IndexControl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月21日 下午9:43:30
 *
 */
@Controller
public class IndexControl {
	@Autowired
	private AllDimService allDimService;

	@RequestMapping("/")
	public String index(Model model, HttpServletResponse response) throws SystemException {
		List<DimBlood> list = allDimService.findDimBlood();
	    model.addAttribute("list", list);
	    return "/index";
	}
}
