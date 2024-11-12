package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final BoofcvLibraryAccessors laccForBoofcvLibraryAccessors = new BoofcvLibraryAccessors(owner);
    private final BuildLibraryAccessors laccForBuildLibraryAccessors = new BuildLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final CronetLibraryAccessors laccForCronetLibraryAccessors = new CronetLibraryAccessors(owner);
    private final Duanhong169LibraryAccessors laccForDuanhong169LibraryAccessors = new Duanhong169LibraryAccessors(owner);
    private final EdmodoLibraryAccessors laccForEdmodoLibraryAccessors = new EdmodoLibraryAccessors(owner);
    private final EntityLibraryAccessors laccForEntityLibraryAccessors = new EntityLibraryAccessors(owner);
    private final FaceLibraryAccessors laccForFaceLibraryAccessors = new FaceLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final GradleLibraryAccessors laccForGradleLibraryAccessors = new GradleLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MediapipeLibraryAccessors laccForMediapipeLibraryAccessors = new MediapipeLibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final Okhttp3LibraryAccessors laccForOkhttp3LibraryAccessors = new Okhttp3LibraryAccessors(owner);
    private final OpencvLibraryAccessors laccForOpencvLibraryAccessors = new OpencvLibraryAccessors(owner);
    private final PhotoLibraryAccessors laccForPhotoLibraryAccessors = new PhotoLibraryAccessors(owner);
    private final PlayLibraryAccessors laccForPlayLibraryAccessors = new PlayLibraryAccessors(owner);
    private final RecyclerviewLibraryAccessors laccForRecyclerviewLibraryAccessors = new RecyclerviewLibraryAccessors(owner);
    private final Retrofit2LibraryAccessors laccForRetrofit2LibraryAccessors = new Retrofit2LibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final YukukuLibraryAccessors laccForYukukuLibraryAccessors = new YukukuLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for ambilwarna (yuku.ambilwarna:ambilwarna)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAmbilwarna() {
            return create("ambilwarna");
    }

        /**
         * Creates a dependency provider for colorpicker (com.github.QuadFlask:colorpicker)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getColorpicker() {
            return create("colorpicker");
    }

        /**
         * Creates a dependency provider for compiler (com.github.bumptech.glide:compiler)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            return create("compiler");
    }

        /**
         * Creates a dependency provider for cropper (com.edmodo:cropper)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCropper() {
            return create("cropper");
    }

        /**
         * Creates a dependency provider for gpuimage (jp.co.cyberagent.android:gpuimage)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGpuimage() {
            return create("gpuimage");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

        /**
         * Creates a dependency provider for library (org.hybridsquad.android:library)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibrary() {
            return create("library");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

        /**
         * Creates a dependency provider for multidex (com.android.support:multidex)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMultidex() {
            return create("multidex");
    }

        /**
         * Creates a dependency provider for photofilter (com.github.mukeshsolanki:photofilter)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPhotofilter() {
            return create("photofilter");
    }

        /**
         * Creates a dependency provider for sticker (io.github.nkarasov:sticker)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSticker() {
            return create("sticker");
    }

        /**
         * Creates a dependency provider for stickerview (com.github.wuapnjie:StickerView)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStickerview() {
            return create("stickerview");
    }

        /**
         * Creates a dependency provider for ucrop (com.github.yalantis:ucrop)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUcrop() {
            return create("ucrop");
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at boofcv
     */
    public BoofcvLibraryAccessors getBoofcv() {
        return laccForBoofcvLibraryAccessors;
    }

    /**
     * Returns the group of libraries at build
     */
    public BuildLibraryAccessors getBuild() {
        return laccForBuildLibraryAccessors;
    }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at cronet
     */
    public CronetLibraryAccessors getCronet() {
        return laccForCronetLibraryAccessors;
    }

    /**
     * Returns the group of libraries at duanhong169
     */
    public Duanhong169LibraryAccessors getDuanhong169() {
        return laccForDuanhong169LibraryAccessors;
    }

    /**
     * Returns the group of libraries at edmodo
     */
    public EdmodoLibraryAccessors getEdmodo() {
        return laccForEdmodoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at entity
     */
    public EntityLibraryAccessors getEntity() {
        return laccForEntityLibraryAccessors;
    }

    /**
     * Returns the group of libraries at face
     */
    public FaceLibraryAccessors getFace() {
        return laccForFaceLibraryAccessors;
    }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() {
        return laccForGoogleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at gradle
     */
    public GradleLibraryAccessors getGradle() {
        return laccForGradleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mediapipe
     */
    public MediapipeLibraryAccessors getMediapipe() {
        return laccForMediapipeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at okhttp
     */
    public OkhttpLibraryAccessors getOkhttp() {
        return laccForOkhttpLibraryAccessors;
    }

    /**
     * Returns the group of libraries at okhttp3
     */
    public Okhttp3LibraryAccessors getOkhttp3() {
        return laccForOkhttp3LibraryAccessors;
    }

    /**
     * Returns the group of libraries at opencv
     */
    public OpencvLibraryAccessors getOpencv() {
        return laccForOpencvLibraryAccessors;
    }

    /**
     * Returns the group of libraries at photo
     */
    public PhotoLibraryAccessors getPhoto() {
        return laccForPhotoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at play
     */
    public PlayLibraryAccessors getPlay() {
        return laccForPlayLibraryAccessors;
    }

    /**
     * Returns the group of libraries at recyclerview
     */
    public RecyclerviewLibraryAccessors getRecyclerview() {
        return laccForRecyclerviewLibraryAccessors;
    }

    /**
     * Returns the group of libraries at retrofit2
     */
    public Retrofit2LibraryAccessors getRetrofit2() {
        return laccForRetrofit2LibraryAccessors;
    }

    /**
     * Returns the group of libraries at squareup
     */
    public SquareupLibraryAccessors getSquareup() {
        return laccForSquareupLibraryAccessors;
    }

    /**
     * Returns the group of libraries at yukuku
     */
    public YukukuLibraryAccessors getYukuku() {
        return laccForYukukuLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {
        private final AndroidImageLibraryAccessors laccForAndroidImageLibraryAccessors = new AndroidImageLibraryAccessors(owner);
        private final AndroidMaskableLibraryAccessors laccForAndroidMaskableLibraryAccessors = new AndroidMaskableLibraryAccessors(owner);

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cropper (com.canhub.cropper:android-cropper)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCropper() {
                return create("android.cropper");
        }

        /**
         * Returns the group of libraries at android.image
         */
        public AndroidImageLibraryAccessors getImage() {
            return laccForAndroidImageLibraryAccessors;
        }

        /**
         * Returns the group of libraries at android.maskable
         */
        public AndroidMaskableLibraryAccessors getMaskable() {
            return laccForAndroidMaskableLibraryAccessors;
        }

    }

    public static class AndroidImageLibraryAccessors extends SubDependencyFactory {
        private final AndroidImageCropperLibraryAccessors laccForAndroidImageCropperLibraryAccessors = new AndroidImageCropperLibraryAccessors(owner);

        public AndroidImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at android.image.cropper
         */
        public AndroidImageCropperLibraryAccessors getCropper() {
            return laccForAndroidImageCropperLibraryAccessors;
        }

    }

    public static class AndroidImageCropperLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidImageCropperLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cropper (com.vanniktech:android-image-cropper)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("android.image.cropper");
        }

            /**
             * Creates a dependency provider for v450 (com.vanniktech:android-image-cropper)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV450() {
                return create("android.image.cropper.v450");
        }

    }

    public static class AndroidMaskableLibraryAccessors extends SubDependencyFactory {

        public AndroidMaskableLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for layout (com.github.christophesmet:android_maskable_layout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLayout() {
                return create("android.maskable.layout");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxAppcompatLibraryAccessors laccForAndroidxAppcompatLibraryAccessors = new AndroidxAppcompatLibraryAccessors(owner);
        private final AndroidxCameraLibraryAccessors laccForAndroidxCameraLibraryAccessors = new AndroidxCameraLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxEmojiLibraryAccessors laccForAndroidxEmojiLibraryAccessors = new AndroidxEmojiLibraryAccessors(owner);
        private final AndroidxEmoji2LibraryAccessors laccForAndroidxEmoji2LibraryAccessors = new AndroidxEmoji2LibraryAccessors(owner);
        private final AndroidxEspressoLibraryAccessors laccForAndroidxEspressoLibraryAccessors = new AndroidxEspressoLibraryAccessors(owner);
        private final AndroidxGraphicsLibraryAccessors laccForAndroidxGraphicsLibraryAccessors = new AndroidxGraphicsLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxPagingLibraryAccessors laccForAndroidxPagingLibraryAccessors = new AndroidxPagingLibraryAccessors(owner);
        private final AndroidxRenderscriptLibraryAccessors laccForAndroidxRenderscriptLibraryAccessors = new AndroidxRenderscriptLibraryAccessors(owner);
        private final AndroidxUiLibraryAccessors laccForAndroidxUiLibraryAccessors = new AndroidxUiLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() {
                return create("androidx.activity");
        }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() {
                return create("androidx.constraintlayout");
        }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() {
                return create("androidx.junit");
        }

            /**
             * Creates a dependency provider for mediarouter (androidx.mediarouter:mediarouter)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMediarouter() {
                return create("androidx.mediarouter");
        }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() {
                return create("androidx.recyclerview");
        }

        /**
         * Returns the group of libraries at androidx.appcompat
         */
        public AndroidxAppcompatLibraryAccessors getAppcompat() {
            return laccForAndroidxAppcompatLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.camera
         */
        public AndroidxCameraLibraryAccessors getCamera() {
            return laccForAndroidxCameraLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.emoji
         */
        public AndroidxEmojiLibraryAccessors getEmoji() {
            return laccForAndroidxEmojiLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.emoji2
         */
        public AndroidxEmoji2LibraryAccessors getEmoji2() {
            return laccForAndroidxEmoji2LibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.espresso
         */
        public AndroidxEspressoLibraryAccessors getEspresso() {
            return laccForAndroidxEspressoLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.graphics
         */
        public AndroidxGraphicsLibraryAccessors getGraphics() {
            return laccForAndroidxGraphicsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.paging
         */
        public AndroidxPagingLibraryAccessors getPaging() {
            return laccForAndroidxPagingLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.renderscript
         */
        public AndroidxRenderscriptLibraryAccessors getRenderscript() {
            return laccForAndroidxRenderscriptLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.ui
         */
        public AndroidxUiLibraryAccessors getUi() {
            return laccForAndroidxUiLibraryAccessors;
        }

    }

    public static class AndroidxAppcompatLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxAppcompatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for v161 (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV161() {
                return create("androidx.appcompat.v161");
        }

    }

    public static class AndroidxCameraLibraryAccessors extends SubDependencyFactory {

        public AndroidxCameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for camera2 (androidx.camera:camera-camera2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCamera2() {
                return create("androidx.camera.camera2");
        }

            /**
             * Creates a dependency provider for core (androidx.camera:camera-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.camera.core");
        }

            /**
             * Creates a dependency provider for lifecycle (androidx.camera:camera-lifecycle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycle() {
                return create("androidx.camera.lifecycle");
        }

            /**
             * Creates a dependency provider for view (androidx.camera:camera-view)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getView() {
                return create("androidx.camera.view");
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.core.ktx");
        }

    }

    public static class AndroidxEmojiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxEmojiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for emoji (androidx.emoji:emoji)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.emoji");
        }

            /**
             * Creates a dependency provider for appcompat (androidx.emoji:emoji-appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.emoji.appcompat");
        }

            /**
             * Creates a dependency provider for bundled (androidx.emoji:emoji-bundled)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBundled() {
                return create("androidx.emoji.bundled");
        }

            /**
             * Creates a dependency provider for v2800 (androidx.emoji:emoji)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV2800() {
                return create("androidx.emoji.v2800");
        }

    }

    public static class AndroidxEmoji2LibraryAccessors extends SubDependencyFactory {

        public AndroidxEmoji2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bundled (androidx.emoji2:emoji2-bundled)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBundled() {
                return create("androidx.emoji2.bundled");
        }

    }

    public static class AndroidxEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.espresso.core");
        }

    }

    public static class AndroidxGraphicsLibraryAccessors extends SubDependencyFactory {
        private final AndroidxGraphicsShapesLibraryAccessors laccForAndroidxGraphicsShapesLibraryAccessors = new AndroidxGraphicsShapesLibraryAccessors(owner);

        public AndroidxGraphicsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.graphics.shapes
         */
        public AndroidxGraphicsShapesLibraryAccessors getShapes() {
            return laccForAndroidxGraphicsShapesLibraryAccessors;
        }

    }

    public static class AndroidxGraphicsShapesLibraryAccessors extends SubDependencyFactory {

        public AndroidxGraphicsShapesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.graphics:graphics-shapes-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("androidx.graphics.shapes.android");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForAndroidxLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.lifecycle.viewmodel.ktx");
        }

    }

    public static class AndroidxPagingLibraryAccessors extends SubDependencyFactory {

        public AndroidxPagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.paging:paging-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.paging.runtime");
        }

    }

    public static class AndroidxRenderscriptLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxRenderscriptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for renderscript (androidx.renderscript:renderscript)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.renderscript");
        }

            /**
             * Creates a dependency provider for v130 (androidx.renderscript:renderscript)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV130() {
                return create("androidx.renderscript.v130");
        }

    }

    public static class AndroidxUiLibraryAccessors extends SubDependencyFactory {

        public AndroidxUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.ui:ui-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("androidx.ui.android");
        }

    }

    public static class BoofcvLibraryAccessors extends SubDependencyFactory {

        public BoofcvLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.boofcv:boofcv-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("boofcv.android");
        }

    }

    public static class BuildLibraryAccessors extends SubDependencyFactory {

        public BuildLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradle (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() {
                return create("build.gradle");
        }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComGithubLibraryAccessors laccForComGithubLibraryAccessors = new ComGithubLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github
         */
        public ComGithubLibraryAccessors getGithub() {
            return laccForComGithubLibraryAccessors;
        }

    }

    public static class ComGithubLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBumptechLibraryAccessors laccForComGithubBumptechLibraryAccessors = new ComGithubBumptechLibraryAccessors(owner);

        public ComGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.bumptech
         */
        public ComGithubBumptechLibraryAccessors getBumptech() {
            return laccForComGithubBumptechLibraryAccessors;
        }

    }

    public static class ComGithubBumptechLibraryAccessors extends SubDependencyFactory {
        private final ComGithubBumptechGlideLibraryAccessors laccForComGithubBumptechGlideLibraryAccessors = new ComGithubBumptechGlideLibraryAccessors(owner);

        public ComGithubBumptechLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.bumptech.glide
         */
        public ComGithubBumptechGlideLibraryAccessors getGlide() {
            return laccForComGithubBumptechGlideLibraryAccessors;
        }

    }

    public static class ComGithubBumptechGlideLibraryAccessors extends SubDependencyFactory {

        public ComGithubBumptechGlideLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glide (com.github.bumptech.glide:glide)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGlide() {
                return create("com.github.bumptech.glide.glide");
        }

    }

    public static class CronetLibraryAccessors extends SubDependencyFactory {

        public CronetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for embedded (org.chromium.net:cronet-embedded)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEmbedded() {
                return create("cronet.embedded");
        }

    }

    public static class Duanhong169LibraryAccessors extends SubDependencyFactory {

        public Duanhong169LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for colorpicker (com.github.duanhong169:colorpicker)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getColorpicker() {
                return create("duanhong169.colorpicker");
        }

    }

    public static class EdmodoLibraryAccessors extends SubDependencyFactory {
        private final EdmodoAndroidLibraryAccessors laccForEdmodoAndroidLibraryAccessors = new EdmodoAndroidLibraryAccessors(owner);

        public EdmodoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edmodo.android
         */
        public EdmodoAndroidLibraryAccessors getAndroid() {
            return laccForEdmodoAndroidLibraryAccessors;
        }

    }

    public static class EdmodoAndroidLibraryAccessors extends SubDependencyFactory {
        private final EdmodoAndroidImageLibraryAccessors laccForEdmodoAndroidImageLibraryAccessors = new EdmodoAndroidImageLibraryAccessors(owner);

        public EdmodoAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edmodo.android.image
         */
        public EdmodoAndroidImageLibraryAccessors getImage() {
            return laccForEdmodoAndroidImageLibraryAccessors;
        }

    }

    public static class EdmodoAndroidImageLibraryAccessors extends SubDependencyFactory {

        public EdmodoAndroidImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cropper (com.theartofdev.edmodo:android-image-cropper)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCropper() {
                return create("edmodo.android.image.cropper");
        }

    }

    public static class EntityLibraryAccessors extends SubDependencyFactory {

        public EntityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for extraction (com.google.mlkit:entity-extraction)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtraction() {
                return create("entity.extraction");
        }

    }

    public static class FaceLibraryAccessors extends SubDependencyFactory {
        private final FaceDetectionLibraryAccessors laccForFaceDetectionLibraryAccessors = new FaceDetectionLibraryAccessors(owner);
        private final FaceMeshLibraryAccessors laccForFaceMeshLibraryAccessors = new FaceMeshLibraryAccessors(owner);

        public FaceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at face.detection
         */
        public FaceDetectionLibraryAccessors getDetection() {
            return laccForFaceDetectionLibraryAccessors;
        }

        /**
         * Returns the group of libraries at face.mesh
         */
        public FaceMeshLibraryAccessors getMesh() {
            return laccForFaceMeshLibraryAccessors;
        }

    }

    public static class FaceDetectionLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public FaceDetectionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for detection (com.google.mlkit:face-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("face.detection");
        }

            /**
             * Creates a dependency provider for v1700 (com.google.mlkit:face-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV1700() {
                return create("face.detection.v1700");
        }

    }

    public static class FaceMeshLibraryAccessors extends SubDependencyFactory {
        private final FaceMeshDetectionLibraryAccessors laccForFaceMeshDetectionLibraryAccessors = new FaceMeshDetectionLibraryAccessors(owner);

        public FaceMeshLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at face.mesh.detection
         */
        public FaceMeshDetectionLibraryAccessors getDetection() {
            return laccForFaceMeshDetectionLibraryAccessors;
        }

    }

    public static class FaceMeshDetectionLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public FaceMeshDetectionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for detection (com.google.mlkit:face-mesh-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("face.mesh.detection");
        }

            /**
             * Creates a dependency provider for v1600beta1 (com.google.mlkit:face-mesh-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV1600beta1() {
                return create("face.mesh.detection.v1600beta1");
        }

            /**
             * Creates a dependency provider for v1600beta3 (com.google.mlkit:face-mesh-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV1600beta3() {
                return create("face.mesh.detection.v1600beta3");
        }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleCloudLibraryAccessors laccForGoogleCloudLibraryAccessors = new GoogleCloudLibraryAccessors(owner);
        private final GoogleMediapipeLibraryAccessors laccForGoogleMediapipeLibraryAccessors = new GoogleMediapipeLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at google.cloud
         */
        public GoogleCloudLibraryAccessors getCloud() {
            return laccForGoogleCloudLibraryAccessors;
        }

        /**
         * Returns the group of libraries at google.mediapipe
         */
        public GoogleMediapipeLibraryAccessors getMediapipe() {
            return laccForGoogleMediapipeLibraryAccessors;
        }

    }

    public static class GoogleCloudLibraryAccessors extends SubDependencyFactory {

        public GoogleCloudLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for vision (com.google.cloud:google-cloud-vision)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVision() {
                return create("google.cloud.vision");
        }

    }

    public static class GoogleMediapipeLibraryAccessors extends SubDependencyFactory {

        public GoogleMediapipeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for formats (com.google.mediapipe:mediapipe-formats)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFormats() {
                return create("google.mediapipe.formats");
        }

            /**
             * Creates a dependency provider for solutions (com.google.mediapipe:mediapipe-solutions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSolutions() {
                return create("google.mediapipe.solutions");
        }

    }

    public static class GradleLibraryAccessors extends SubDependencyFactory {

        public GradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for v802 (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV802() {
                return create("gradle.v802");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() {
                return create("kotlin.reflect");
        }

    }

    public static class MediapipeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final MediapipeAndroidLibraryAccessors laccForMediapipeAndroidLibraryAccessors = new MediapipeAndroidLibraryAccessors(owner);
        private final MediapipeSolutionsLibraryAccessors laccForMediapipeSolutionsLibraryAccessors = new MediapipeSolutionsLibraryAccessors(owner);

        public MediapipeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mediapipe (com.google.mediapipe:mediapipe)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("mediapipe");
        }

            /**
             * Creates a dependency provider for framework (com.google.mediapipe:mediapipe-framework)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFramework() {
                return create("mediapipe.framework");
        }

        /**
         * Returns the group of libraries at mediapipe.android
         */
        public MediapipeAndroidLibraryAccessors getAndroid() {
            return laccForMediapipeAndroidLibraryAccessors;
        }

        /**
         * Returns the group of libraries at mediapipe.solutions
         */
        public MediapipeSolutionsLibraryAccessors getSolutions() {
            return laccForMediapipeSolutionsLibraryAccessors;
        }

    }

    public static class MediapipeAndroidLibraryAccessors extends SubDependencyFactory {
        private final MediapipeAndroidSolutionLibraryAccessors laccForMediapipeAndroidSolutionLibraryAccessors = new MediapipeAndroidSolutionLibraryAccessors(owner);

        public MediapipeAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mediapipe.android.solution
         */
        public MediapipeAndroidSolutionLibraryAccessors getSolution() {
            return laccForMediapipeAndroidSolutionLibraryAccessors;
        }

    }

    public static class MediapipeAndroidSolutionLibraryAccessors extends SubDependencyFactory {

        public MediapipeAndroidSolutionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for face (com.google.mediapipe:mediapipe-android-solution-face)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFace() {
                return create("mediapipe.android.solution.face");
        }

    }

    public static class MediapipeSolutionsLibraryAccessors extends SubDependencyFactory {

        public MediapipeSolutionsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for v0112 (com.google.mediapipe:mediapipe-solutions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV0112() {
                return create("mediapipe.solutions.v0112");
        }

            /**
             * Creates a dependency provider for v090 (com.google.mediapipe:mediapipe-solutions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV090() {
                return create("mediapipe.solutions.v090");
        }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory {

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for v4120 (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV4120() {
                return create("okhttp.v4120");
        }

    }

    public static class Okhttp3LibraryAccessors extends SubDependencyFactory {

        public Okhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("okhttp3.okhttp");
        }

    }

    public static class OpencvLibraryAccessors extends SubDependencyFactory {
        private final OpencvAndroidLibraryAccessors laccForOpencvAndroidLibraryAccessors = new OpencvAndroidLibraryAccessors(owner);

        public OpencvLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at opencv.android
         */
        public OpencvAndroidLibraryAccessors getAndroid() {
            return laccForOpencvAndroidLibraryAccessors;
        }

    }

    public static class OpencvAndroidLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OpencvAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.opencv:opencv-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("opencv.android");
        }

            /**
             * Creates a dependency provider for v453 (org.opencv:opencv-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV453() {
                return create("opencv.android.v453");
        }

            /**
             * Creates a dependency provider for v455 (org.opencv:opencv-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV455() {
                return create("opencv.android.v455");
        }

            /**
             * Creates a dependency provider for v480dev2 (org.opencv:opencv-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getV480dev2() {
                return create("opencv.android.v480dev2");
        }

    }

    public static class PhotoLibraryAccessors extends SubDependencyFactory {

        public PhotoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for manipulator (com.guhungry.android:photo-manipulator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManipulator() {
                return create("photo.manipulator");
        }

    }

    public static class PlayLibraryAccessors extends SubDependencyFactory {
        private final PlayServicesLibraryAccessors laccForPlayServicesLibraryAccessors = new PlayServicesLibraryAccessors(owner);

        public PlayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at play.services
         */
        public PlayServicesLibraryAccessors getServices() {
            return laccForPlayServicesLibraryAccessors;
        }

    }

    public static class PlayServicesLibraryAccessors extends SubDependencyFactory {
        private final PlayServicesMlkitLibraryAccessors laccForPlayServicesMlkitLibraryAccessors = new PlayServicesMlkitLibraryAccessors(owner);

        public PlayServicesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for drive (com.google.android.gms:play-services-drive)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDrive() {
                return create("play.services.drive");
        }

            /**
             * Creates a dependency provider for vision (com.google.android.gms:play-services-vision)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVision() {
                return create("play.services.vision");
        }

            /**
             * Creates a dependency provider for wearable (com.google.android.gms:play-services-wearable)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWearable() {
                return create("play.services.wearable");
        }

        /**
         * Returns the group of libraries at play.services.mlkit
         */
        public PlayServicesMlkitLibraryAccessors getMlkit() {
            return laccForPlayServicesMlkitLibraryAccessors;
        }

    }

    public static class PlayServicesMlkitLibraryAccessors extends SubDependencyFactory {
        private final PlayServicesMlkitFaceLibraryAccessors laccForPlayServicesMlkitFaceLibraryAccessors = new PlayServicesMlkitFaceLibraryAccessors(owner);

        public PlayServicesMlkitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at play.services.mlkit.face
         */
        public PlayServicesMlkitFaceLibraryAccessors getFace() {
            return laccForPlayServicesMlkitFaceLibraryAccessors;
        }

    }

    public static class PlayServicesMlkitFaceLibraryAccessors extends SubDependencyFactory {

        public PlayServicesMlkitFaceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for detection (com.google.android.gms:play-services-mlkit-face-detection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDetection() {
                return create("play.services.mlkit.face.detection");
        }

    }

    public static class RecyclerviewLibraryAccessors extends SubDependencyFactory {

        public RecyclerviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for integration (com.github.bumptech.glide:recyclerview-integration)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIntegration() {
                return create("recyclerview.integration");
        }

    }

    public static class Retrofit2LibraryAccessors extends SubDependencyFactory {
        private final Retrofit2ConverterLibraryAccessors laccForRetrofit2ConverterLibraryAccessors = new Retrofit2ConverterLibraryAccessors(owner);

        public Retrofit2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at retrofit2.converter
         */
        public Retrofit2ConverterLibraryAccessors getConverter() {
            return laccForRetrofit2ConverterLibraryAccessors;
        }

    }

    public static class Retrofit2ConverterLibraryAccessors extends SubDependencyFactory {

        public Retrofit2ConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() {
                return create("retrofit2.converter.gson");
        }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {
        private final SquareupLoggingLibraryAccessors laccForSquareupLoggingLibraryAccessors = new SquareupLoggingLibraryAccessors(owner);

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() {
                return create("squareup.retrofit");
        }

        /**
         * Returns the group of libraries at squareup.logging
         */
        public SquareupLoggingLibraryAccessors getLogging() {
            return laccForSquareupLoggingLibraryAccessors;
        }

    }

    public static class SquareupLoggingLibraryAccessors extends SubDependencyFactory {

        public SquareupLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() {
                return create("squareup.logging.interceptor");
        }

    }

    public static class YukukuLibraryAccessors extends SubDependencyFactory {

        public YukukuLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ambilwarna (com.github.yukuku:ambilwarna)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAmbilwarna() {
                return create("yukuku.ambilwarna");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidVersionAccessors vaccForAndroidVersionAccessors = new AndroidVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: activity (1.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("activity"); }

            /**
             * Returns the version associated to this alias: agp (8.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: ambilwarna (2.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAmbilwarna() { return getVersion("ambilwarna"); }

            /**
             * Returns the version associated to this alias: ambilwarnaVersion (2.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAmbilwarnaVersion() { return getVersion("ambilwarnaVersion"); }

            /**
             * Returns the version associated to this alias: androidCropper (2.2.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidCropper() { return getVersion("androidCropper"); }

            /**
             * Returns the version associated to this alias: androidImageCropper (4.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidImageCropper() { return getVersion("androidImageCropper"); }

            /**
             * Returns the version associated to this alias: androidImageCropperVersion (4.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidImageCropperVersion() { return getVersion("androidImageCropperVersion"); }

            /**
             * Returns the version associated to this alias: appcompat (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: appcompatVersion (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompatVersion() { return getVersion("appcompatVersion"); }

            /**
             * Returns the version associated to this alias: boofcvAndroid (0.37)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBoofcvAndroid() { return getVersion("boofcvAndroid"); }

            /**
             * Returns the version associated to this alias: cameraCore (1.3.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCameraCore() { return getVersion("cameraCore"); }

            /**
             * Returns the version associated to this alias: colorpicker (0.0.13)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getColorpicker() { return getVersion("colorpicker"); }

            /**
             * Returns the version associated to this alias: colorpickerVersion (1.1.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getColorpickerVersion() { return getVersion("colorpickerVersion"); }

            /**
             * Returns the version associated to this alias: compiler (4.16.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("compiler"); }

            /**
             * Returns the version associated to this alias: constraintlayout (2.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConstraintlayout() { return getVersion("constraintlayout"); }

            /**
             * Returns the version associated to this alias: converterGsonVersion (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConverterGsonVersion() { return getVersion("converterGsonVersion"); }

            /**
             * Returns the version associated to this alias: coreKtx (1.13.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreKtx() { return getVersion("coreKtx"); }

            /**
             * Returns the version associated to this alias: cronetEmbedded (119.6045.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCronetEmbedded() { return getVersion("cronetEmbedded"); }

            /**
             * Returns the version associated to this alias: cropper (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCropper() { return getVersion("cropper"); }

            /**
             * Returns the version associated to this alias: emoji (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEmoji() { return getVersion("emoji"); }

            /**
             * Returns the version associated to this alias: emoji2Bundled (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEmoji2Bundled() { return getVersion("emoji2Bundled"); }

            /**
             * Returns the version associated to this alias: emojiBundled (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEmojiBundled() { return getVersion("emojiBundled"); }

            /**
             * Returns the version associated to this alias: emojiVersion (28.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEmojiVersion() { return getVersion("emojiVersion"); }

            /**
             * Returns the version associated to this alias: entityExtraction (16.0.0-beta5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEntityExtraction() { return getVersion("entityExtraction"); }

            /**
             * Returns the version associated to this alias: espressoCore (3.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspressoCore() { return getVersion("espressoCore"); }

            /**
             * Returns the version associated to this alias: faceDetection (16.1.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFaceDetection() { return getVersion("faceDetection"); }

            /**
             * Returns the version associated to this alias: faceDetectionVersion (17.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFaceDetectionVersion() { return getVersion("faceDetectionVersion"); }

            /**
             * Returns the version associated to this alias: faceMeshDetection (16.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFaceMeshDetection() { return getVersion("faceMeshDetection"); }

            /**
             * Returns the version associated to this alias: faceMeshDetectionVersion (16.0.0-beta3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFaceMeshDetectionVersion() { return getVersion("faceMeshDetectionVersion"); }

            /**
             * Returns the version associated to this alias: googleCloudVision (1.100.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleCloudVision() { return getVersion("googleCloudVision"); }

            /**
             * Returns the version associated to this alias: googleFaceMeshDetection (16.0.0-beta1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleFaceMeshDetection() { return getVersion("googleFaceMeshDetection"); }

            /**
             * Returns the version associated to this alias: googleMediapipeSolutions (0.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleMediapipeSolutions() { return getVersion("googleMediapipeSolutions"); }

            /**
             * Returns the version associated to this alias: gpuimage (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGpuimage() { return getVersion("gpuimage"); }

            /**
             * Returns the version associated to this alias: gradle (8.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradle() { return getVersion("gradle"); }

            /**
             * Returns the version associated to this alias: gradleVersion (8.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradleVersion() { return getVersion("gradleVersion"); }

            /**
             * Returns the version associated to this alias: graphicsShapesAndroid (1.0.0-beta01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGraphicsShapesAndroid() { return getVersion("graphicsShapesAndroid"); }

            /**
             * Returns the version associated to this alias: gson (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: junitVersion (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunitVersion() { return getVersion("junitVersion"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinReflect (1.9.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinReflect() { return getVersion("kotlinReflect"); }

            /**
             * Returns the version associated to this alias: library (2.2.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLibrary() { return getVersion("library"); }

            /**
             * Returns the version associated to this alias: lifecycleViewmodelKtx (2.8.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycleViewmodelKtx() { return getVersion("lifecycleViewmodelKtx"); }

            /**
             * Returns the version associated to this alias: loggingInterceptorVersion (4.9.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLoggingInterceptorVersion() { return getVersion("loggingInterceptorVersion"); }

            /**
             * Returns the version associated to this alias: material (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: mediapipe (0.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipe() { return getVersion("mediapipe"); }

            /**
             * Returns the version associated to this alias: mediapipeAndroidSolutionFace (0.8.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipeAndroidSolutionFace() { return getVersion("mediapipeAndroidSolutionFace"); }

            /**
             * Returns the version associated to this alias: mediapipeFormats (0.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipeFormats() { return getVersion("mediapipeFormats"); }

            /**
             * Returns the version associated to this alias: mediapipeFramework (0.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipeFramework() { return getVersion("mediapipeFramework"); }

            /**
             * Returns the version associated to this alias: mediapipeSolutions (0.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipeSolutions() { return getVersion("mediapipeSolutions"); }

            /**
             * Returns the version associated to this alias: mediapipeSolutionsVersion (0.11.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediapipeSolutionsVersion() { return getVersion("mediapipeSolutionsVersion"); }

            /**
             * Returns the version associated to this alias: mediarouter (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMediarouter() { return getVersion("mediarouter"); }

            /**
             * Returns the version associated to this alias: multidex (1.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMultidex() { return getVersion("multidex"); }

            /**
             * Returns the version associated to this alias: okhttp (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: okhttpVersion (4.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttpVersion() { return getVersion("okhttpVersion"); }

            /**
             * Returns the version associated to this alias: opencvAndroid (4.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpencvAndroid() { return getVersion("opencvAndroid"); }

            /**
             * Returns the version associated to this alias: opencvAndroidVersion (4.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpencvAndroidVersion() { return getVersion("opencvAndroidVersion"); }

            /**
             * Returns the version associated to this alias: opencvOpencvAndroid (4.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpencvOpencvAndroid() { return getVersion("opencvOpencvAndroid"); }

            /**
             * Returns the version associated to this alias: opencvOpencvAndroidVersion (4.8.0-dev2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOpencvOpencvAndroidVersion() { return getVersion("opencvOpencvAndroidVersion"); }

            /**
             * Returns the version associated to this alias: orgOpencvOpencvAndroid (4.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOrgOpencvOpencvAndroid() { return getVersion("orgOpencvOpencvAndroid"); }

            /**
             * Returns the version associated to this alias: orgOpencvOpencvAndroid2 (4.5.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOrgOpencvOpencvAndroid2() { return getVersion("orgOpencvOpencvAndroid2"); }

            /**
             * Returns the version associated to this alias: pagingRuntime (3.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPagingRuntime() { return getVersion("pagingRuntime"); }

            /**
             * Returns the version associated to this alias: photoManipulator (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPhotoManipulator() { return getVersion("photoManipulator"); }

            /**
             * Returns the version associated to this alias: photofilter (<latest-version>)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPhotofilter() { return getVersion("photofilter"); }

            /**
             * Returns the version associated to this alias: playServicesDrive (17.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlayServicesDrive() { return getVersion("playServicesDrive"); }

            /**
             * Returns the version associated to this alias: playServicesMlkitFaceDetection (17.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlayServicesMlkitFaceDetection() { return getVersion("playServicesMlkitFaceDetection"); }

            /**
             * Returns the version associated to this alias: playServicesVision (20.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlayServicesVision() { return getVersion("playServicesVision"); }

            /**
             * Returns the version associated to this alias: playServicesWearable (18.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlayServicesWearable() { return getVersion("playServicesWearable"); }

            /**
             * Returns the version associated to this alias: recyclerview (1.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRecyclerview() { return getVersion("recyclerview"); }

            /**
             * Returns the version associated to this alias: recyclerviewIntegration (4.15.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRecyclerviewIntegration() { return getVersion("recyclerviewIntegration"); }

            /**
             * Returns the version associated to this alias: renderscript (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRenderscript() { return getVersion("renderscript"); }

            /**
             * Returns the version associated to this alias: renderscriptVersion (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRenderscriptVersion() { return getVersion("renderscriptVersion"); }

            /**
             * Returns the version associated to this alias: smartcolorpicker (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSmartcolorpicker() { return getVersion("smartcolorpicker"); }

            /**
             * Returns the version associated to this alias: sticker (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSticker() { return getVersion("sticker"); }

            /**
             * Returns the version associated to this alias: stickerview (v1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getStickerview() { return getVersion("stickerview"); }

            /**
             * Returns the version associated to this alias: theartofdevAndroidImageCropper (x.y.z)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTheartofdevAndroidImageCropper() { return getVersion("theartofdevAndroidImageCropper"); }

            /**
             * Returns the version associated to this alias: ucrop (2.2.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUcrop() { return getVersion("ucrop"); }

            /**
             * Returns the version associated to this alias: uiAndroid (1.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUiAndroid() { return getVersion("uiAndroid"); }

        /**
         * Returns the group of versions at versions.android
         */
        public AndroidVersionAccessors getAndroid() {
            return vaccForAndroidVersionAccessors;
        }

    }

    public static class AndroidVersionAccessors extends VersionFactory  {

        private final AndroidMaskableVersionAccessors vaccForAndroidMaskableVersionAccessors = new AndroidMaskableVersionAccessors(providers, config);
        public AndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.android.maskable
         */
        public AndroidMaskableVersionAccessors getMaskable() {
            return vaccForAndroidMaskableVersionAccessors;
        }

    }

    public static class AndroidMaskableVersionAccessors extends VersionFactory  {

        public AndroidMaskableVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.maskable.layout (v1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLayout() { return getVersion("android.maskable.layout"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApplication to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

            /**
             * Creates a plugin provider for jetbrainsKotlinAndroid to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJetbrainsKotlinAndroid() { return createPlugin("jetbrainsKotlinAndroid"); }

    }

}
