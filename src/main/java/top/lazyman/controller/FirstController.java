package top.lazyman.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstController {
    @RequestMapping("/")
    public String first(){
        return "index";
    }

    @RequestMapping("echarts")
    @ResponseBody
        public void echarts(HttpServletResponse response) throws IOException {
        System.out.println("SUCCESS");
        JSONObject jsonObject = new JSONObject();
//        HashMap<String, String> registered = new HashMap<>();
//        registered.put("2020/11/29", "400");
//        registered.put("2020/11/30", "900");
//        registered.put("2020/12/01", "1400");
//        registered.put("2020/12/02", "500");
//        registered.put("2020/12/03", "240");
//        registered.put("2020/12/04", "470");
//        registered.put("2020/12/05", "380");
//        registered.put("2020/12/06", "1000");
//        registered.put("2020/12/07", "200");
        List<List> echarts = new ArrayList<>();
        List<String> registered = new ArrayList<>();
        registered.add("400");
        registered.add("900");
        registered.add("1400");
        registered.add("300");
        registered.add("510");
        registered.add("340");
        registered.add("1000");
        registered.add("200");
        registered.add("600");
        List<String> linkman = new ArrayList<>();
        linkman.add("2020/11/29");
        linkman.add("2020/11/30");
        linkman.add("2020/12/01");
        linkman.add("2020/12/02");
        linkman.add("2020/12/03");
        linkman.add("2020/12/04");
        linkman.add("2020/12/05");
        linkman.add("2020/12/06");
        linkman.add("2020/12/07");
        List<Integer> information = new ArrayList<>();
        information.add(70);
        information.add(60);
        information.add(50);
        information.add(40);
        information.add(50);
        information.add(60);
        information.add(72);
        information.add(80);
        information.add(90);
        List<Integer> pd = new ArrayList<>();
        pd.add(1);
        pd.add(0);
        pd.add(1);
        pd.add(1);
        pd.add(1);
        pd.add(0);
        pd.add(1);
        pd.add(0);
        pd.add(1);
        echarts.add(registered);
        echarts.add(linkman);
        echarts.add(information);
        echarts.add(pd);
        jsonObject.put("echarts",echarts);
            response.getWriter().write(jsonObject.toString());
        }
}
