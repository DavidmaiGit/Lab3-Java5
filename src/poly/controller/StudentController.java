package poly.controller;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.sun.javafx.collections.MappingChange.Map;

import poly.bean.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {
		@RequestMapping("index")
		public String index(ModelMap modelMap) {
			Student student = new Student("Mai Đình Dinh", 8.5, "APP");
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
}
