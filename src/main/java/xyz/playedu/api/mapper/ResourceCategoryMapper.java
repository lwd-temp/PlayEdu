package xyz.playedu.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.playedu.api.domain.ResourceCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author tengteng
* @description 针对表【resource_categories】的数据库操作Mapper
* @createDate 2023-02-23 09:50:18
* @Entity xyz.playedu.api.domain.ResourceCategory
*/
@Mapper
public interface ResourceCategoryMapper extends BaseMapper<ResourceCategory> {

}




