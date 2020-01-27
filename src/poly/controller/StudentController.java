package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.bean.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {
		@RequestMapping("index")
		public String index(ModelMap modelMap) {
			Student student = new Student("Mai Đình Dinh", 8.5, "WEB");
			modelMap.addAttribute("student", student);
			return "student";
		}
}
