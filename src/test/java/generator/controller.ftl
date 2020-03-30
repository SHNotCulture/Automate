package ${basePackageController};

import ${basePackageModel}.${modelNameUpperCamel};

import ${basePackageService}.${modelNameUpperCamel}Service;
import ${basePackage}.aspect.HttpLog;
import ${basePackage}.util.ControllerRspUtil;
import ${basePackage}.util.ActionRspUtil;
import ${basePackage}.util.ControllerRsp;
import ${basePackage}.util.ActionRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @Description: ${modelNameUpperCamel}Controller类
* @author ${author}
* @date ${date}
*/
@RestController
@RequestMapping("/${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {

    private  static final Logger logger= LoggerFactory.getLogger(${modelNameUpperCamel}Controller.class);
    @Autowired
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;
    /**
    * 查询信息
    * @param${modelNameLowerCamel}
    * @return
    */
    @PostMapping(value = "/get${modelNameUpperCamel}")
    @HttpLog(operationType = "0",modularTypeName = "查询${modelNameUpperCamel}")
    public ActionRsp get${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel},HttpServletRequest request){
    return ActionRspUtil.Success(${modelNameLowerCamel}Service.get${modelNameUpperCamel}(${modelNameLowerCamel}));
    }
    /**
    * 查询信息(分页)
    * @param${modelNameLowerCamel}
    * @return
    */
    @PostMapping(value = "/get${modelNameUpperCamel}byPage")
    @HttpLog(operationType = "0",modularTypeName = "查询${modelNameUpperCamel}(分页)")
    public ControllerRsp get${modelNameUpperCamel}byPage(${modelNameUpperCamel} ${modelNameLowerCamel},HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(${modelNameLowerCamel}Service.get${modelNameUpperCamel}byPage(${modelNameLowerCamel},page,limit));
    }
    /**
    * 更新信息
    * @param${modelNameLowerCamel}
    * @return
    */
    @PostMapping(value = "/update${modelNameUpperCamel}")
    @HttpLog(operationType = "1",modularTypeName = "更新${modelNameUpperCamel}信息")
    public ActionRsp Update${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel},HttpServletRequest request)
    {
        return ActionRspUtil.Success(${modelNameLowerCamel}Service. Update${modelNameUpperCamel}(${modelNameLowerCamel}));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/delete${modelNameUpperCamel}")
    @HttpLog(operationType = "1",modularTypeName = "删除${modelNameUpperCamel}信息")
    public ActionRsp Delete${modelNameUpperCamel}(Integer id){
    return ActionRspUtil.Success(${modelNameLowerCamel}Service.Delete${modelNameUpperCamel}(id));
    }
}