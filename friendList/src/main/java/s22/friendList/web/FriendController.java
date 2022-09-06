package s22.friendList.web;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import s22.friendList.domain.Friend;

@Controller
public class FriendController {
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@GetMapping("/index")
	public String friendForm(Model model) {	
		model.addAttribute("friend", new Friend());
		return "form";
	}

	@PostMapping("/index")
	public String friendSubmit(@ModelAttribute Friend name, Model model) {
		friends.add(name);
		model.addAttribute("friendlist", friends);
		return "form";
	}
}

