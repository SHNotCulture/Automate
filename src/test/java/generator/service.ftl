package ${basePackageService};

import ${basePackageModel}.${modelNameUpperCamel};
import ${basePackage}.util.PageBean;

import java.util.List;

/**
* @Description: ${modelNameUpperCamel}Service接口
* @author ${author}
* @date ${date}
*/
public interface ${modelNameUpperCamel}Service {
    PageBean<${modelNameUpperCamel}> get${modelNameUpperCamel}byPage(${modelNameUpperCamel} ${modelNameLowerCamel}, Integer page, Integer limit);
    List<${modelNameUpperCamel}> get${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel});
    String Update${modelNameUpperCamel}(${modelNameUpperCamel} ${modelNameLowerCamel});
    String Delete${modelNameUpperCamel}(Integer id);
    ${modelNameUpperCamel} get${modelNameUpperCamel}ByID(Integer id);

}