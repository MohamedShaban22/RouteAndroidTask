package com.example.routeandroidtask.di;

import com.example.domain.repo.ProductsRepo;
import com.example.domain.usecase.GetProducts;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/routeandroidtask/di/UseCaseModule;", "", "()V", "provideUseCase", "Lcom/example/domain/usecase/GetProducts;", "productsRepo", "Lcom/example/domain/repo/ProductsRepo;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.routeandroidtask.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.usecase.GetProducts provideUseCase(@org.jetbrains.annotations.NotNull
    com.example.domain.repo.ProductsRepo productsRepo) {
        return null;
    }
}