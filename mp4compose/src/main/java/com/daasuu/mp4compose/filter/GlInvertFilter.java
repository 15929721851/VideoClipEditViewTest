package com.daasuu.mp4compose.filter;

import com.daasuu.mp4compose.utils.GlUtils;

/**
 * Created by sudamasayuki on 2018/01/06.
 */

public class GlInvertFilter extends GlFilter {
    private static final String FRAGMENT_SHADER =
            "#extension GL_OES_EGL_image_external : require\n" +
                    "precision mediump float;" +
                    "varying vec2 vTextureCoord;" +
                    "uniform samplerExternalOES sTexture;\n" +
                    "void main() {" +
                    "lowp vec4 color = texture2D(sTexture, vTextureCoord);" +
                    "gl_FragColor = vec4((1.0 - color.rgb), color.w);" +
                    "}";

    public GlInvertFilter() {
        super(GlUtils.DEFAULT_VERTEX_SHADER, FRAGMENT_SHADER);
    }
}

