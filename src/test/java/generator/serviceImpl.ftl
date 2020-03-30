package ${basePackageServiceImpl};

import ${basePackageDao}.${modelNameUpperCamel}Mapper;
import ${basePackageModel}.${modelNameUpperCamel};
import ${basePackageService}.${modelNameUpperCamel}Service;
import ${basePackageModel}.${modelNameUpperCamel}Criteria;
import ${basePackage}.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: ${modelNameUpperCamel}Service接口实现类
* @author ${author}
* @date ${date}
*/
@Service
public class ${modelNameUpperCamel}ServiceImpl  implements ${modelNameUpperCamel}Service {

    private  static final Logger logger= LoggerFactory.getLogger( ${modelNameUpperCamel}ServiceImpl.class);
    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

    /**
    * 设置查询条件
    * @param ${modelNameLowerCamel}
    * @return
    */
    private  ${modelNameUpperCamel}Criteria setCriteria(${modelNameUpperCamel} ${modelNameLowerCamel}){
        ${modelNameUpperCamel}Criteria ${modelNameLowerCamel}Criteria= new ${modelNameUpperCamel}Criteria();
        if(${modelNameLowerCamel}!=null){
        ${modelNameUpperCamel}Criteria.Criteria criteria=${modelNameLowerCamel}Criteria.createCriteria();
        if(${modelNameLowerCamel}.getId()!=null){
        criteria.andIdEqualTo(${modelNameLowerCamel}.getId());
        }

        }
        return  ${modelNameLowerCamel}Criteria;
    }
    /**
    * 获取数据总量
    * @param ${modelNameLowerCamel}
    * @return
    */
    private Integer getCount(${modelNameUpperCamel} ${modelNameLowerCamel}){
    Integer total =(int)${modelNameLowerCamel}Mapper.countByExample(setCriteria(${modelNameLowerCamel}));
    return total;
    }
    /**
    *查询(分页)
    * @param ${modelNameLowerCamel}
    * @param page
    * @param limit
    * @return
    */
    public PageBean<${modelNameUpperCamel}> get${modelNameUpperCamel}byPage(${modelNameUpperCamel} ${modelNameLowerCamel}, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<${modelNameUpperCamel}> ${modelNameUpperCamel}s=get${modelNameUpperCamel}(${modelNameLowerCamel});
            Integer countNums =getCount(${modelNameLowerCamel});
            PageBean<${modelNameUpperCamel}> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(${modelNameUpperCamel}s);
            return pageData;
        }
    /**
    * 查询
    * @param ${modelNameLowerCamel}
    * @return
    */
    public List<${modelNameUpperCamel}> get${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel}){
    List<${modelNameUpperCamel}>  ${modelNameUpperCamel}s=${modelNameLowerCamel}Mapper.selectByExample(setCriteria(${modelNameLowerCamel}));
    return ${modelNameUpperCamel}s;
    }
    /**
    * 更新
    * @param ${modelNameLowerCamel}
    * @return
    */
    public String Update${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel})
    {
            String result="";
            try{
            if(${modelNameLowerCamel}.getId()!=null){
            ${modelNameLowerCamel}Mapper.updateByPrimaryKeySelective(${modelNameLowerCamel});
            }
            else
            {
            ${modelNameLowerCamel}Mapper.insertSelective(${modelNameLowerCamel});
            }
            }
            catch (Exception e)
            {

            }
            result="更新成功";
            return result;
    }
    /**
    * 删除
    * @param id
    * @return
    */
    public String Delete${modelNameUpperCamel}(Integer id){
    ${modelNameLowerCamel}Mapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public ${modelNameUpperCamel} get${modelNameUpperCamel}ByID(Integer id) {
    return  ${modelNameLowerCamel}Mapper.selectByPrimaryKey(id);
    }
}
