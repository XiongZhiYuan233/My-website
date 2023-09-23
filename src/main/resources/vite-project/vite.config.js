import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
// import createProxyMiddleware from 'http-proxy-middleware'
// const { createProxyMiddleware } = require('http-proxy-middleware');

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  server:{
    port:'5173',
    proxy:{
      '/api':{
        target:'http://localhost:8080/',
        changeOrigin:true,
        rewrite:(path) => path.replace(/^\/api/,'')
      }
    }
  }
})
