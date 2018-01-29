package com.tsai.project;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class ProjectController  extends Controller{
    public void index(){
        render("");
    }

    @ActionKey("/create")
    public  void createProject(){
        render("createProject.html");
    }
}
