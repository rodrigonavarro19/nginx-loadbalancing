FROM node:18.20-alpine3.18 as dev-deps
WORKDIR /app
COPY package.json package.json
RUN yarn install --frozen-lockfile


FROM node:18.20-alpine3.18 as builder
WORKDIR /app
COPY --from=dev-deps /app/node_modules ./node_modules
COPY . .
# RUN yarn test
RUN yarn build


FROM nginx:1.23.3 as prod
EXPOSE 80

COPY --from=builder /app/dist/nginx-front/browser /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY nginx/nginx.conf /etc/nginx/conf.d

CMD [ "nginx","-g", "daemon off;" ]