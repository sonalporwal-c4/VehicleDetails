// Generated by Dagger (https://dagger.dev).
package com.android.task.vehicle;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.android.task.data.di.HiltDependenciesModule_ProvideGsonConverterFactoryFactory;
import com.android.task.data.di.HiltDependenciesModule_ProvideGsonFactory;
import com.android.task.data.di.HiltDependenciesModule_ProvideLoggingInterceptorFactory;
import com.android.task.data.di.HiltDependenciesModule_ProvideOKHttpClientFactory;
import com.android.task.data.di.HiltDependenciesModule_ProvideRetrofitInstanceFactory;
import com.android.task.data.di.HiltDependenciesModule_ProvidesRetrofitServiceFactory;
import com.android.task.data.network.VehicleAPI;
import com.android.task.data.repository.VehicleDataSource;
import com.android.task.domain.interactors.GetVehicleNotesUseCase;
import com.android.task.domain.interactors.GetVehiclesUseCase;
import com.android.task.domain.repository.VehicleRepositoryInterface;
import com.android.task.vehicle.di.RepoModule_ProvideVehicleRepositoryFactory;
import com.android.task.vehicle.di.RepoModule_ProvideVehicleUseCaseFactory;
import com.android.task.vehicle.viewModel.VehicleViewModel_AssistedFactory;
import com.android.task.vehicle.viewModel.VehicleViewModel_AssistedFactory_Factory;
import com.android.task.vehicle.views.VehicleDetailsFragment;
import com.android.task.vehicle.views.VehicleFragment;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GetVehiclesUseCase> provideVehicleUseCaseProvider;

      private volatile Provider<GetVehicleNotesUseCase> getVehicleNotesUseCaseProvider;

      private volatile Provider<VehicleViewModel_AssistedFactory> vehicleViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private OkHttpClient okHttpClient() {
        return HiltDependenciesModule_ProvideOKHttpClientFactory.provideOKHttpClient(HiltDependenciesModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor());
      }

      private GsonConverterFactory gsonConverterFactory() {
        return HiltDependenciesModule_ProvideGsonConverterFactoryFactory.provideGsonConverterFactory(HiltDependenciesModule_ProvideGsonFactory.provideGson());
      }

      private VehicleAPI vehicleAPI() {
        return HiltDependenciesModule_ProvideRetrofitInstanceFactory.provideRetrofitInstance(okHttpClient(), gsonConverterFactory());
      }

      private VehicleDataSource vehicleDataSource() {
        return HiltDependenciesModule_ProvidesRetrofitServiceFactory.providesRetrofitService(vehicleAPI());
      }

      private VehicleRepositoryInterface vehicleRepositoryInterface() {
        return RepoModule_ProvideVehicleRepositoryFactory.provideVehicleRepository(vehicleDataSource());
      }

      private GetVehiclesUseCase getVehiclesUseCase() {
        return RepoModule_ProvideVehicleUseCaseFactory.provideVehicleUseCase(vehicleRepositoryInterface());
      }

      private Provider<GetVehiclesUseCase> getVehiclesUseCaseProvider() {
        Object local = provideVehicleUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          provideVehicleUseCaseProvider = (Provider<GetVehiclesUseCase>) local;
        }
        return (Provider<GetVehiclesUseCase>) local;
      }

      private GetVehicleNotesUseCase getVehicleNotesUseCase() {
        return new GetVehicleNotesUseCase(vehicleRepositoryInterface());
      }

      private Provider<GetVehicleNotesUseCase> getVehicleNotesUseCaseProvider() {
        Object local = getVehicleNotesUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          getVehicleNotesUseCaseProvider = (Provider<GetVehicleNotesUseCase>) local;
        }
        return (Provider<GetVehicleNotesUseCase>) local;
      }

      private VehicleViewModel_AssistedFactory vehicleViewModel_AssistedFactory() {
        return VehicleViewModel_AssistedFactory_Factory.newInstance(getVehiclesUseCaseProvider(), getVehicleNotesUseCaseProvider());
      }

      private Provider<VehicleViewModel_AssistedFactory> vehicleViewModel_AssistedFactoryProvider(
          ) {
        Object local = vehicleViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          vehicleViewModel_AssistedFactoryProvider = (Provider<VehicleViewModel_AssistedFactory>) local;
        }
        return (Provider<VehicleViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> mapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.android.task.vehicle.viewModel.VehicleViewModel", (Provider) vehicleViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), mapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      private Set<ViewModelProvider.Factory> defaultActivityViewModelFactorySetOfViewModelProviderFactory(
          ) {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String>emptySet(), new ViewModelCBuilder(), defaultActivityViewModelFactorySetOfViewModelProviderFactory(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return Collections.<String>emptySet();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.mapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        private Set<ViewModelProvider.Factory> defaultFragmentViewModelFactorySetOfViewModelProviderFactory(
            ) {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public void injectVehicleDetailsFragment(VehicleDetailsFragment vehicleDetailsFragment) {
        }

        @Override
        public void injectVehicleFragment(VehicleFragment vehicleFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String>emptySet(), new ViewModelCBuilder(), ActivityCImpl.this.defaultActivityViewModelFactorySetOfViewModelProviderFactory(), defaultFragmentViewModelFactorySetOfViewModelProviderFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.android.task.vehicle.viewModel.VehicleViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.vehicleViewModel_AssistedFactory();

            case 1: // com.android.task.domain.interactors.GetVehiclesUseCase 
            return (T) ActivityCImpl.this.getVehiclesUseCase();

            case 2: // com.android.task.domain.interactors.GetVehicleNotesUseCase 
            return (T) ActivityCImpl.this.getVehicleNotesUseCase();

            default: throw new AssertionError(id);
          }
        }
      }
    }

    private final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>emptyMap();
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
