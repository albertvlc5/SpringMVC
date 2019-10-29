package com.example.springmvc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/example")
class ControladorInicial {

    @GetMapping("/")
    fun index(model: Model):String {
        model.addAttribute("mensaje", "Hola Mundo");
        return "index"
    }
    @GetMapping("/view1")
    fun view1():ModelAndView{
        var mav = ModelAndView("index1")
        mav.addObject("name","Albert")
        return mav
    }
    @GetMapping("/view2")
    fun view2():ModelAndView{
        var mav2 = ModelAndView("index2")
        mav2.addObject("User", User("Pepe","1234"))
        return mav2
    }

    private fun getUsers(): List<User> {
        val users = ArrayList<User>() ;
        users.add(User("Xavi","123"))
        users.add(User("Luis","45678"))
        users.add(User("Roberto","787"))
        return users;
    }

    @GetMapping("/viewList")
    fun viewList():ModelAndView{
        var mav3=ModelAndView("index3")
        mav3.addObject("Users",getUsers())
        return mav3
    }

}