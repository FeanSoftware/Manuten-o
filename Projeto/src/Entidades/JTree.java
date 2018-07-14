package Entidades;

import Interface.Sistema.NotaInspesao;
import banco.ResgatarDados;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class JTree extends DefaultTreeCellRenderer {

    private static javax.swing.JTree tree;
    private static Usuario user;
    private JDesktopPane desktop;
    TreeSelectionEvent e;

    public JTree() {
        //  this.desktop = desktop;
        TreeNode top = new TreeNode(Internacionalização.getNomeEmpresa());
        top.setColor(Internacionalização.getCorNomeEmpresa());
        List<Setor> empresas = ResgatarDados.getAllEmpresas();
        empresas.stream().map((Setor unidade) -> {
            TreeNode node = new TreeNode(unidade.getNome());
            List<Setor> list = ResgatarDados.getAllSetoresEquipamentos(unidade);
            //System.out.println("Entidades.JTree.<init>()");
            list.forEach((s) -> {
                node.add(Inserir(s, 0));
            });
            return node;
        }).forEachOrdered((node) -> {
            top.add(node);
        });
        tree = new javax.swing.JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setShowsRootHandles(true);
        tree.setCellRenderer(new CellRender());
        tree.addTreeSelectionListener(this::click);
        tree.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    TreePath path = e.getPath();
                    TreeNode currentNode = (TreeNode) path.getLastPathComponent();
                    //System.out.println(currentNode.getId());
                    System.out.println(currentNode.getColor());
                    if (currentNode.getTipo() == Internacionalização.getTipoEquipamento()) {
                        if (JOptionPane.showConfirmDialog(null, "Confirmar a aberturar de inspeçao para equipamento: " + currentNode.getNome()
                                + "\n Ultima Inspeção: " + Internacionalização.formataDataBrasil(currentNode.getData()), "Confirmar abertura", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            NotaInspesao n = new NotaInspesao(currentNode.getE(), user, Internacionalização.getIdInspNoraml());
                            n.setVisible(true);
                            // desktop.add(n);
                        }
                    }
                }
            }
        });
    }

    public javax.swing.JTree get(Usuario user) {
        JTree.user = user;
        return tree;
    }

    public void setAreaTrabalho() {

    }

    private void click(TreeSelectionEvent ev) {
        e = ev;
    }

    private TreeNode Inserir(Setor setor, int i) {
        TreeNode nivel = new TreeNode(setor.getNome());

        if (setor.getSubSetor() != null) {
            nivel.setId(setor.getId());
            nivel.setTipo(Internacionalização.getTipoSetor());
            setor.getSubSetor().forEach((s) -> {
                TreeNode subNivel = Inserir(s, i + 1);
                subNivel.setColor(subNivel.Color);
                nivel.setId(s.getId());
                nivel.add(subNivel);
            });
            nivel.setColor(setor.getCor());
        }
        if (setor.getEquipamento() != null) {

            setor.getEquipamento().forEach((equipameto) -> {
                TreeNode no = new TreeNode(equipameto.getNome());
                no.setE(equipameto);
                no.setData(equipameto.getDataUltimaExpesao());
                no.setColor(equipameto.getCor());
                no.setId(equipameto.getId());
                no.setTipo(Internacionalização.getTipoEquipamento());
                nivel.add(no);
            });
        }
        return nivel;
    }
}
