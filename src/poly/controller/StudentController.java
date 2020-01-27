package poly.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import poly.bean.Student;
import poly.bean.Major;

@Controller
@RequestMapping("/student/")
public class StudentController {
		@RequestMapping("index")
		public String index(ModelMap modelMap) {
			Student student = new Student("Mai Đình Dinh", 8.5, "WEB");
			modelMap.addAttribute("student", student);
			return "student2";
		}
		@ModelAttribute("majors")
		public HashMap<String, String> getMajors() {
			HashMap<String, String> majors = new HashMap<>();
			majors.put("APP", "Ứng dụng phần mềm");
			majors.put("WEB", "Thiết kế web");
			return majors;
		}
		
		@ModelAttribute("majorss")
		public List<Major> getMajorss(){
			List<Major> majors = new ArrayList<>();
			majors.add( new Major("APP", "Ứng dụng phần mềm"));
			majors.add(new Major("WEB", "Thiết kế Website"));
			return majors;
		}
}
