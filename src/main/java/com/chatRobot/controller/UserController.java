//package com.chatRobot.controller;
//
//public class UserController {
//}
//
package com.chatRobot.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

//    @Resource
//    private IUserService userService;
//
//    @RequestMapping("/showUser.do")
//    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.selectUser(userId);
//        ObjectMapper mapper = new ObjectMapper();
//        response.getWriter().write(mapper.writeValueAsString(user));
//        response.getWriter().close();
//    }
    //接受前台传过来的数据进行一系列处理
    @Autowired
    private IUserService userService;
    /**
     * 获取所有用户列表
     * @param request
     * @return
     */
    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, HttpServletResponse response, Model model){
        List<User> user = userService.findAll();
        model.addAttribute("userList", user);
        request.setAttribute("userList", user);
        response.setContentType("application/json");
        return "/allUser";
    }
    /**
     * 跳转到添加用户界面
     * @param //request
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "/addUser";
    }
    /**
     * 添加用户并重定向
     * @param user
     * @param model //request
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user,Model model){
        userService.save(user);
        return "redirect:/user/getAllUser";
    }
    /**
     *编辑用户
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user,HttpServletRequest request,Model model){
        if(userService.update(user)){
            user = userService.findById(user.getId());
            request.setAttribute("user", user);
            model.addAttribute("user", user);
            return "redirect:/user/getAllUser";
        }else{
            return "/error";
        }
    }
    /**
     * 根据id查询单个用户
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/getUser")
    public String getUser(int id,HttpServletRequest request,Model model){
        request.setAttribute("user", userService.findById(id));
        model.addAttribute("user", userService.findById(id));
        return "/editUser";
    }
    /**
     * 删除用户
     * @param id
     * @param request
     * @param response
     */
    @RequestMapping("/delUser")
//    public void delUser(int id,HttpServletRequest request,HttpServletResponse response){
    public String delUser(int id,HttpServletRequest request,HttpServletResponse response) {
        String result = "{\"result\":\"error\"}";


        if (userService.delete(id)) {
            result = "{\"result\":\"success\"}";
            return "redirect:/user/getAllUser";
        }
        else
            return "/error";
//        response.setContentType("application/json");
//        try {
//
//            PrintWriter out = response.getWriter();
//            out.write(result);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}