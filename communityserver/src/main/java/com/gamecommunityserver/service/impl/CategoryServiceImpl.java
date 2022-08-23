package com.gamecommunityserver.service.impl;

import com.gamecommunityserver.dto.CategoryDTO;
import com.gamecommunityserver.mapper.CategoryMapper;
import com.gamecommunityserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }
    @Override
    public void addCategoryName(CategoryDTO categoryDTO){
        categoryMapper.register(categoryDTO);
    }
    @Override
    public int categoryDuplicateCheck(String categoryName){
        return categoryMapper.categoryDuplicateCheck(categoryName);
    }
    @Override
    public boolean categoryIdCheck(int categoryId){
        return categoryMapper.categoryIdCheck(categoryId) == 0;
    }

    @Override
    public void deleteCategoryId(int categoryId){
        categoryMapper.categoryDelete(categoryId);
    }
}
