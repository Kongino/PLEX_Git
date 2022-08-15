import Vue from "vue";
import Vuex from "vuex";
import auth from "./modules/auth";
import room from "./modules/room";
import roomStore from "./modules/roomStore";
import socketStore from "./modules/socketStore";
import createPersistedState from "vuex-persistedstate";
Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        auth,
        room,
        roomStore,
        socketStore,
    },
    plugins: [
        createPersistedState({
            paths: ["auth", "room", "roomStore"],
        }),
    ],
});
